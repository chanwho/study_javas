import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class ApiExploerWithDatagokrPractice {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // https://apis.data.go.kr/1741000/TsunamiShelter3/getTsunamiShelter1List
        // ?serviceKey=
        // Saxv3nuURevdwhDzibdWkkra4cgad5bSz1rEPt%2B6ZG5KhsCc35wt6%2BhhjtRiCtV3p1WuuZPfMf2sFk4VzqiTSw%3D%3D
        // &pageNo=
        // 1
        // &numOfRows=
        // 10
        // &type=
        // JSON

        StringBuilder urlBuilder = new StringBuilder(
                "https://apis.data.go.kr/1741000/TsunamiShelter3/getTsunamiShelter1List"); /* URL */
        // 2. 오픈 API의요청 규격에 맞는 파라미터 생성, 발급받은 인증키.
        urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8") + "=")
                .append("Saxv3nuURevdwhDzibdWkkra4cgad5bSz1rEPt%2B6ZG5KhsCc35wt6%2BhhjtRiCtV3p1WuuZPfMf2sFk4VzqiTSw%3D%3D"); /*
                                                                                                                              * Service
                                                                                                                              * Key
                                                                                                                              */
        urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "="
                + URLEncoder.encode("1", "UTF-8")); /* XML 또는 JSON */
        urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*
                                                                                                                    * 한
                                                                                                                    * 페이지
                                                                                                                    * 결과
                                                                                                                    * 수
                                                                                                                    */
        urlBuilder.append("&" + URLEncoder.encode("type", "UTF-8") + "=" + URLEncoder.encode("JSON", "UTF-8")); /*
                                                                                                                 * 페이지
                                                                                                                 * 번호
                                                                                                                 */

        URL url;
        HttpURLConnection conn = null;
        try {
            url = new URL(urlBuilder.toString());
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            // conn.setRequestProperty(null, null);
            System.out.println("Response code : " + conn.getResponseCode());

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuffer.append(line);
            }
            int i = 1;
            reader.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            conn.disconnect();
        }
    }
}