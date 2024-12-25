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
            Printo(digitedCurrency);
        }else{
            Printo(amount, digitedCurrency);
            Printo(digitedCurrency);
        }
    }
    public void Printo(String digitedCurrency ){
            /*cambiar el orden de invocacion en los metodos no resuelve le problema talvez sean los nombres iguales
            * no lo he investigado o talvez sea l aforma de imprimir, que anteior mente no daba problema y seria raro que lo de ahroa
            * dos cosas para probar*/
        System.out.printf("\nresultado: %s\n"
                +"1 "+ digitedCurrency+" = USD: %f\n"
                +"1 "+ digitedCurrency+" = EUR: %f\n"
                +"1 "+ digitedCurrency+" = JPY: %f\n"
                +"1 "+ digitedCurrency+" = GBP: %f\n"
                +"1 "+ digitedCurrency+" = AUD: %f\n",
                apiResponseStatus,storedConversions.getUsd(), storedConversions.getEur(),
                storedConversions.getJpy(),storedConversions.getGbp(),
                storedConversions.getAud());
    }
    public void Printo(float amount, String digitedCurrency){
        System.out.printf("\nresultado: "+apiResponseStatus+"\n"
                +amount+" "+digitedCurrency+" = USD: "+ String.format("%f", amount * storedConversions.getUsd())+"\n"
                +amount+" "+digitedCurrency+" = EUR: "+String.format("%f", amount*storedConversions.getEur())+"\n"
                +amount+" "+digitedCurrency+" = JPY: "+String.format("%f", amount*storedConversions.getJpy())+"\n"
                +amount+" "+digitedCurrency+" = GBP: "+String.format("%f", amount*storedConversions.getGbp())+"\n"
                +amount+" "+digitedCurrency+" = AUD: "+String.format("%f", amount*storedConversions.getAud())+"\n");
        }

    }

