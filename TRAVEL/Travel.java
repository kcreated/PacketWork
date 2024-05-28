package TRAVEL;

public class Travel{
    private int people;

    public Travel(int n){
        people = n;
    }

    public int goByVan(){
        /* returns number of vans required to transport everyone (8 per van) */
        return people/8;
    }

    public int goByCanoe(){
        /* returns numbers of canoes required (2 per canoe)*/
        return people/3;
    }

    public int goByPlane(){
        /*returns number of planes reequired (12 per plane)*/
        return people/12;
    }
}