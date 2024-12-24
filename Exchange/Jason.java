package Exchange;

import com.google.gson.annotations.SerializedName;

    public class Jason {
        @SerializedName("result")
        private String apiResponseStatus = "";
        public class ConversionRates{
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
        @SerializedName("conversion_rates")
        ConversionRates storedConversions;
        public ConversionRates getstoredConversions() {return storedConversions;}
        public void setstoredConversions(ConversionRates storedConversions) {this.storedConversions = storedConversions;}

    public void Validation(float amount, String digitedCurrency) {
        /*multiplicar el amount*/
        if (amount <0){
            amount =-amount;
        }if (amount ==0 || amount ==1) {
            Printo();
        }else{
            Printo(amount, digitedCurrency);
        }
    }
    public void Printo(){
        System.out.printf("""
                resultado : %s
            
                USD: %.3f
                EUR: %.3f
                JPY: %.3f
                GBP: %.3f
                AUD: %.3f
                """,apiResponseStatus,storedConversions.getUsd(), storedConversions.getEur(),
                storedConversions.getJpy(),storedConversions.getGbp(),
                storedConversions.getAud());
    }
    public void Printo(float amount, String digitedCurrency){
        System.out.printf("\nresultado: "+apiResponseStatus+"\n"
                +amount+" "+digitedCurrency+" = USD: "+ String.format("%.2f", amount * storedConversions.getUsd())+"\n"
                +amount+" "+digitedCurrency+" = EUR: "+String.format("%.2f", amount*storedConversions.getEur())+"\n"
                +amount+" "+digitedCurrency+" = JPY: "+String.format("%.2f", amount*storedConversions.getJpy())+"\n"
                +amount+" "+digitedCurrency+" = GBP: "+String.format("%.2f", amount*storedConversions.getGbp())+"\n"
                +amount+" "+digitedCurrency+" = AUD: "+String.format("%.2f", amount*storedConversions.getAud())+"\n");
        }

    }

