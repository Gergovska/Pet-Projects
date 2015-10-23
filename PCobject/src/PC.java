/**
 * Created by Geora on 17.10.2015.
 */
class PC {
    CPU pcCentralProcessor=new CPU();
    GPU pcGraphCard = new GPU();
    boolean isWorking = false;
    PC(){
       // boolean b = pcCentralProcessor.setWorking(false);
        System.out.println("PC object created!");
        //System.out.println("It has " + pcCentralProcessor + " CPUs");
    }
    public void startPC(){
        isWorking = true;
        System.out.println("PC is starting ...");
        pcCentralProcessor.setWorking(true);
        pcCentralProcessor.getIsWorking();
    }

    static public void main (String[] args){
            System.out.println("PC is switched off");
            PC myPC = new PC();
            myPC.startPC();
    }

}

class CPU{
    private String model;
    private boolean isWorking = false;
    CPU(){
        model = "Intel Core i7- 5970X";
                System.out.println("CPU object with model: "+ model+ " created");
    }
    public void getIsWorking()
    {
          if ( isWorking == false ){
              System.out.println("CPU is OFF");
          } else {
              System.out.println("CPU is ON");
          }
    }
    public boolean setWorking(boolean State){
        System.out.println("State of CPU is going to be changed from " + isWorking + " to " + State);
        return isWorking=State;
    }


}
class GPU{
    private String model;
    private boolean isWorking = false;

    void getIsWorking(){
        System.out.println("Current State of CPU: ");
    }
}
class RAM {
    private String model;
    private boolean isWorking =false;

    public void getIsWorking(){}
}
class HDD {
    private String model;
    private boolean isWorking = false;

    public void getIsWorking(){}
}
class  PowerSupply{
    private String model;
    private boolean isWorking = false;

    public void getIsWorking(){}
}


