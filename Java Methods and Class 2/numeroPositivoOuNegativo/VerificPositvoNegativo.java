package numeroPositivoOuNegativo;

public class VerificPositvoNegativo {
    public int x;


    public void Numero(int x) {
        this.x = x;
    }

    public String Verific(int x) {
        if (this.x > 0) {
            return ("Numero positivo!");
        } else if (this.x < 0) {
            return ("Numero negativo!");
        } else {
           return ("Numero é zero");
        }


    }

    public String toString() {
        return  "" + x;
    }
}






