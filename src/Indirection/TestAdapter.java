package Indirection;

public class TestAdapter {
    public static void main (String[] args){
        EnemyAttacker tank=new EnemyTank();
        EnemyRobot robot= new EnemyRobot();
        EnemyAttacker robotAdapter= new EnemyRobotAdapter(robot);
        tank.attack();
        robotAdapter.attack();
    }
}
