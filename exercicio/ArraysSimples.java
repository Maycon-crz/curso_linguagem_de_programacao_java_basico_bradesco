import java.util.Arrays;

public class ArraysSimples {
    public static void main(String[] args){
        String[] paisesBRICS = {"Brasil", "Rusia", "India", "China", "South Africa"};
        System.out.println(paisesBRICS[0]);
        System.out.println(Arrays.toString(paisesBRICS));

        //Executando uma busca na array:
        int posicao = Arrays.binarySearch(paisesBRICS, "Brasil");
        System.out.println(paisesBRICS[posicao]);
        //Ordenando Array em ordem alfabética usando o index 0 de cada item
        Arrays.sort(paisesBRICS, 0, paisesBRICS.length);        
        System.out.println(Arrays.toString(paisesBRICS));

        String[][] duasdim = {{"Maycon", "M", "SC"}, {"Scarllet", "F", "US"}};

        System.out.println(duasdim[1][0]);
    }
}
