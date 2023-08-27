package Problem_1;

public class Mississippi {

        private String stateName;
        public Mississippi(){
            stateName="Mississippi";
        }


        public int replaceI(){
            String NewStateName = stateName.replace("i","ii");
            return NewStateName.length();
        }

    public Mississippi(String statename){
        this.stateName = statename;
    }

        public int replaceS(){
            String NewStateName = stateName.replace("ss","s");
            return NewStateName.length();
        }

}
