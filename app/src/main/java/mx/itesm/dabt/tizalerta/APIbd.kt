package mx.itesm.dabt.tizalerta

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface APIbd {

    @FormUrlEncoded
    @POST("db_insert.php")
    fun data(
        @Field("token") token: String)
        : Call<TokenMovil>
}