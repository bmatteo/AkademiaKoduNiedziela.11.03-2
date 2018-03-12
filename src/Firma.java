import java.util.ArrayList;
import java.util.HashSet;

public class Firma {
    private String companyName;
    private String adress;
    private int workers;
    private ArrayList<Pracownik> workersList;

    public Firma(String companyName, String adress) {
        this.companyName = companyName;
        this.adress = adress;
        this.workersList = new ArrayList<>();
        this.workers = this.workersList.size();

    }

    public String getCompanyName() {
        return companyName;
    }


    public String getAdress() {
        return adress;
    }


    public int getWorkers() {
        return workers;
    }

    public Pracownik getWorker(int index) {
        if (index >= workersList.size()){
            System.out.println("Za duży indeks");
            return null;
        }
        return workersList.get(index);
    }

    public void addWorker(Pracownik worker) {
        this.workersList.add(worker);
        this.workers = this.workersList.size();
    }

    @Override
    public String toString() {
        return "Firma{" +
                "companyName='" + companyName + '\'' +
                ", adress='" + adress + '\'' +
                ", workers=" + workers;
    }


    public ArrayList<Pracownik> getAllMens() {
        ArrayList<Pracownik> result = new ArrayList<>();
        for (Pracownik p : this.workersList) {
            if(p.sex.equals(Sex2.MALE)) {
                result.add(p);
            }
        }
        return result;
    }
}
