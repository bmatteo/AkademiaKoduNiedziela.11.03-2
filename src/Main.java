public class Main {
    public static void main(String[] args) {
        Firma mak = new Firma("Mak", "Grodzka 20");
        final Pracownik heniu = new Pracownik("Henryk","Kowalski",2100.01, 48);
        //heniu.sex = Sex.SHEMALE;
        mak.addWorker(heniu);

        heniu.setAge(30);

        System.out.println(heniu);

        //System.out.println(mak.toString());
        int index = 5;
        if (mak.getWorker(index) == null){
            //System.out.println("Nie ma takiego pracownika");
        }else {
            //System.out.println(mak.getWorker(index).getName());
        }
    }
}
