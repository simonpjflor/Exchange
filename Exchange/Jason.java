/*Class to map the http json response*/
package Exchange;
import com.google.gson.annotations.SerializedName;

    public class Jason {

        @SerializedName("result")
        private String apiResponseStatus = "";
        @SerializedName("conversion_rates")
        ConversionRates storedConversions;

        public class ConversionRates{//http internal Json
        //most traded currencies
        @SerializedName("USD")
        private float usd = 0.0f;
        @SerializedName("EUR")
        private float eur = 0.0f;
        @SerializedName("JPY")
        private float jpy = 0.0f;
        @SerializedName("GBP")
        private float gbp = 0.0f;
        @SerializedName("AUD")
        private float aud = 0.0f;


        public float getUsd() {return usd;}
        public void setUsd(float usd) {this.usd = usd;}

        public float getEur() {return eur;}
        public void setEur(float eur) {this.eur = eur;}

        public float getJpy() {return jpy;}
        public void setJpy(float jpy) {this.jpy = jpy;}

        public float getGbp() {return gbp;}
        public void setGbp(float gbp) {this.gbp = gbp;}

        public float getAud() {return aud;}
        public void setAud(float aud) {this.aud = aud;}
        }

        public String getApiResponseStatus() {return apiResponseStatus;}
        public void setApiResponseStatus(String apiResponseStatus) {this.apiResponseStatus = apiResponseStatus;}

        public ConversionRates getstoredConversions() {return storedConversions;}
        public void setstoredConversions(ConversionRates storedConversions) {this.storedConversions = storedConversions;}
}

