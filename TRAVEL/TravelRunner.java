package TRAVEL;

public class TravelRunner {
    public static void main(String[]args){    
            for (int people = 6; people <= 40; people += 2) {
            Travel travel = new Travel(people);
            int vans = travel.goByVan();
            int canoes = travel.goByCanoe();
            int planes = travel.goByPlane();
            
            System.out.println("people = " + people + ", vans = " + vans + ", canoes = " + canoes + ", planes = " + planes);
        }
    }
}
