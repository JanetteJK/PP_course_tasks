public class Customer {
    private int id;
    private long startTime;
    private long endTime;
    private static int _id;
    private long serviceStart;
    private long serviceEnd;
    private long serviceTime;



    public Customer() {
        _id++;
        id = _id;
    }

    public int getId() {
        return id;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getTimeSpent() {
        return endTime - startTime;
    }

    public void setServiceStart(long serviceStart){
        this.serviceStart = serviceStart;
    }

    public void setEndService(long serviceEnd){
        this.serviceEnd = serviceEnd;
    }

    public long getServiceTime(){
        return serviceEnd - serviceStart;
    }

    public long getOverallTime(){
        return getServiceTime() + getTimeSpent();
    }





}