package com.example.githubuas.api

import com.example.githubuas.data.model.DetailUserResponse
import com.example.githubuas.data.model.User
import com.example.githubuas.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query
interface Api {
    @GET("search/users")
    @Headers("Authorization: token f57a4b77ff720bdbfc8325e5d671eb37a48acfaf")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token f57a4b77ff720bdbfc8325e5d671eb37a48acfaf")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token f57a4b77ff720bdbfc8325e5d671eb37a48acfaf")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token f57a4b77ff720bdbfc8325e5d671eb37a48acfaf")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}