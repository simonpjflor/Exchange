package Exchange;

import com.google.gson.annotations.SerializedName;

    public class Jason {
        @SerializedName("result")
        private String apiResponseStatus = "";
        @SerializedName("conversion_rates")
        ConversionRates storedConversions;
        public class ConversionRates{//internal http response Json
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
        public float getEur() {return eur;}
        public float getJpy() {return jpy;}
        public float getGbp() {return gbp;}
        public float getAud() {return aud;}
        }
        public String getApiResponseStatus() {return apiResponseStatus;}
        public ConversionRates getstoredConversions() {return storedConversions;}
    }

