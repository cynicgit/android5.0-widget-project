package ip.cynic.beautiful_girl.network.api;

import ip.cynic.beautiful_girl.bean.json.GankIoJson;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by cynic on 2016/5/30.
 */
public interface GankApi {

    @GET("data/福利/{number}/{page}")
    Observable<GankIoJson> getGankGirls(@Path("number") int number, @Path("page") int age);


}
