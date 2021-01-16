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
    @Headers("Authorization: token ef99b9df5903a2990fc66211bd49f504ebd39b22")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token ef99b9df5903a2990fc66211bd49f504ebd39b22")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token ef99b9df5903a2990fc66211bd49f504ebd39b22")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token ef99b9df5903a2990fc66211bd49f504ebd39b22")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}