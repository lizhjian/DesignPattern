package com.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义聚合类
 */
public class ConcreteMyAggregate {
   private List<Object> list = new ArrayList<>();

    public ConcreteMyAggregate() {
    }
    public  void addObject(Object object){
        this.list.add(object);
    }
    public void  setList(List<Object> list){
      this.list = list;
    }

    //聚合类获取迭代器方法
    public MyIterator createIterator(){
        return new ConcreteInerator();
    }

    //使用内部类定义迭代器，可以直接使用外部类的属性
    private  class ConcreteInerator implements  MyIterator{
        private  int cursor;//定义游标用于记录遍历时的位置


        @Override
        public void first() {
           cursor=0;
        }

        @Override
        public void next() {
          if(cursor<list.size()){
              cursor++;
          }
        }

        @Override
        public boolean hasNext() {
            if(cursor<list.size()){
                return  true;
            }else{
                return false;
            }

        }

        @Override
        public boolean isFirst() {
            return cursor==0?true:false;
        }

        @Override
        public boolean isLast() {
            return cursor==(list.size()-1)?true:false;
        }

        @Override
        public Object getCurrentObj() {
            return list.get(cursor);
        }
    }

}
