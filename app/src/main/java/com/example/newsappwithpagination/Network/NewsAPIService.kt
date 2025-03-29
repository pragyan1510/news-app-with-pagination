import com.example.newsappwithpagination.models.NewsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPIService {
    @GET("v4/top-headlines") // Ensure this matches your API docs
    suspend fun getNews(
        @Query("country") country: String = "us",
        @Query("page") page: Int,
        @Query("pageSize") pageSize: Int = 10,
        @Query("apikey") apikey: String = "2faa7677b94a69ab5f3eafd6c1b6f686"

    ): NewsResponse
}
