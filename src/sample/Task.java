package sample;

import java.util.ArrayList;

/**
 * Created by vladimir on 17.12.16.
 */
public class Task {
    private boolean critical;
    private int reserve;
    private ArrayList<Integer> prevTasks;
    private ArrayList<Integer> nextTasks;
    private int execTime;
    private int startTime;
    private int endTime;

    {
        prevTasks = new ArrayList<>();
        nextTasks = new ArrayList<>();
    }

    public Task(int eTime){

        this.reserve = 0;
        this.execTime = eTime;
        this.startTime = 0;
        this.endTime = eTime;
        this.critical = false;
    }

    public void AddPrevTask(Integer i){ prevTasks.add(i);}

    public void AddNextTask(Integer i){ nextTasks.add(i);}

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
        this.startTime = endTime - execTime;
    }

    public int getReserve() {
        return reserve;
    }

    public void setReserve(int reserve) {
        this.reserve = reserve;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
        this.endTime = startTime + execTime;
    }

    public ArrayList<Integer> getPrevTasks() {
        return prevTasks;
    }

    public void setPrevTasks(ArrayList<Integer> prevTask) {
        this.prevTasks = prevTask;
    }

    public ArrayList<Integer> getNextTasks() {
        return nextTasks;
    }

    public void setNextTasks(ArrayList<Integer> nextTask) {
        this.nextTasks = nextTask;
    }

    public int getExecTime() {
        return execTime;
    }

//    public void setExecTime(int execTime) {
//        this.execTime = execTime;
//    }


    public boolean isCritical() {
        return critical;
    }

    public void setCritical(boolean critical) {
        this.critical = critical;
    }

    public boolean IsCritical(){return critical;}
}
