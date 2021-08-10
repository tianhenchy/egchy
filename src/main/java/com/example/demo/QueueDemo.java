package com.example.demo;

import org.omg.SendingContext.RunTime;

public class QueueDemo {

    private Object[] queueArray;
    /**
     * 队列大小
     */
    private int maxSize ;
    /**
     * 前端指针
     */
    private int front ;
    /**
     * 后端指针
     */
    private int rear ;
    /**
     * 队列中实际元素的数目
     */
    private int nItems;

    public QueueDemo(int s){
        maxSize = s ;
        queueArray = new Object[maxSize] ;
        front = 0 ;
        rear = -1 ;
        nItems = 0 ;
    }

    /**
     * 队列新增
     */
    public void insert(int value){
        if(isFull()){
            throw new RuntimeException("队列已满");
        }else{
            //判断队列是否满了
            if (rear == maxSize -1) {
                rear = -1 ;
            }
            //队尾指针+1
            queueArray[++rear] = value;
            nItems++ ;
        }
    }

    public Object remove(){
        Object removeValue = null ;
        if(!isFull()){
            removeValue = queueArray[front];
            queueArray[front] = null ;
            front++ ;
            if(front == maxSize){
                front = 0 ;
            }
            nItems-- ;
        }
        return removeValue ;
    }

    public Object peekFront(){
        return queueArray[front];
    }

    public boolean isFull(){
        return nItems == maxSize ;
    }

    public boolean isEmpty(){
        return nItems == 0 ;
    }
    public int size(){
        return nItems ;
    }
}

