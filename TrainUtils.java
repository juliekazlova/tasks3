package j_lab;

public class TrainUtils {
    public Train[] sortById(Train[] mas){
        Train[] result= new Train[mas.length];
        for(int i=0; i<mas.length; i++){
            result[i]=mas[i];
        }
        Train cur;
        for(int j=0; j<result.length-1; j++) {
            for (int i = 0; i < mas.length - 1-j; i++) {
                if (result[i].getId() > result[i + 1].getId()) {
                    cur = result[i];
                    result[i] = result[i + 1];
                    result[i + 1] = cur;
                }
            }
        }
        return result;
    }
    public String print(Train obj){
        StringBuilder sb=new StringBuilder();
        sb.append(obj.getDestination()).append(" ").append(obj.getId()).append(" ").append(obj.getTimeHour()).append(":").append(obj.getTimeMinute());
        return sb.toString();
    }
    public Train findByID(int id, Train[] mas){
        int i=0;
        while (i<mas.length&&mas[i].getId()!=id){
            i++;
        }
        if(i==mas.length) return new Train();
        else return mas[i];
    }
    public Train[] sortByDestination(Train[] mas){
        Train[] result= new Train[mas.length];
        for(int i=0; i<mas.length; i++){
            result[i]=mas[i];
        }
        Train cur;
        for(int j=0; j<result.length-1; j++) {
            for (int i = 0; i < mas.length - 1-j; i++) {
                if (result[i].getDestination().compareTo(result[i + 1].getDestination())<0) {//i лексически меньше
                    cur = result[i];
                    result[i] = result[i + 1];
                    result[i + 1] = cur;
                }
                else if(result[i].getDestination().compareTo(result[i + 1].getDestination())==0){
                    if (result[i].getTimeHour()>result[i + 1].getTimeHour()) {
                        cur = result[i];
                        result[i] = result[i + 1];
                        result[i + 1] = cur;
                    }
                    else if(result[i].getTimeMinute()>result[i + 1].getTimeMinute()){
                        cur = result[i];
                        result[i] = result[i + 1];
                        result[i + 1] = cur;
                    }
                }
            }
        }
        return result;
    }
}
