package filter;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Entity> sourceEntities = new ArrayList<Entity>();
        Entity entity1 = new Entity("Batman",1,"Rich");
        Entity entity2 = new Entity("Flash",2,"Fast");
        Entity entity3 = new Entity("Superman",3,"Super");
        Entity entity4 = new Entity("AntMan",4,"Ant");
        Entity entity5 = new Entity("Thor",5,"Thunder");
        Entity entity6 = new Entity("Druid",6,"Cool");
        sourceEntities.add(entity1);
        sourceEntities.add(entity2);
        sourceEntities.add(entity3);
        sourceEntities.add(entity4);
        sourceEntities.add(entity5);
        sourceEntities.add(entity6);

        List<Integer> IDList = new ArrayList<Integer>();
        IDList.add(2);
        IDList.add(3);
        IDList.add(5);

        for (Entity entity: sourceEntities) {
            System.out.println("before filter : "+ entity.toString()
            );
        }
        System.out.println("=========================================================");

        int steps = 0;

//        for (Entity entity :sourceEntities) {
//            System.out.println("step1--------->");
//            for (Integer id: IDList) {
//                System.out.println("step2=========>");
//                steps++;
//                if (entity.getId().equals(id)){
//                    entity.setAttr2("HollyShit");
//                }
//            }
//        }
        filter1(sourceEntities,IDList,steps);

        System.out.println("+++++++totally steps: "+steps+"+++++++");

        for (Entity entity: sourceEntities) {
            System.out.println("after filter : "+ entity.toString()
            );
        }

    }

    protected static boolean filter1(List<Entity> entities, List<Integer> ids, int steps){
        if (ids.size()>0){
            steps++;
            System.out.println("step1--------->");
            if (ids.get(0).equals(entities.get(0).getId())){
             entities.get(0).setAttr2("HolyCrap");
             ids.remove(ids.get(0));
             System.out.println("step2=========>");
            }
            filter1(entities,ids,steps);
            return true;
        }else {
            System.out.println("+++++++totally steps: "+steps+"+++++++");
            return false;
        }
    }

}
