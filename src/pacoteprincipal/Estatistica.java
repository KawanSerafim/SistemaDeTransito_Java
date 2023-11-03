package pacoteprincipal;

public class Estatistica {
    
    int CityCode, QtdAcidentes;
    String CityName;
    
    Estatistica(){
        this.CityCode = 0;
        this.QtdAcidentes = 0;
        this.CityName = "";
    }
    
    Estatistica(int CCode, int QtdAc, String CName){
       CityCode = CCode;
       QtdAcidentes = QtdAc;
       CityName = CName;
    }
}
