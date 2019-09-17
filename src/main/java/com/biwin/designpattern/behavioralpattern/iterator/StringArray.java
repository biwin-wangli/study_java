package com.biwin.designpattern.behavioralpattern.iterator;

/**
 * @Description
 * @auther wangli
 * @create 2019-09-17 10:11
 */
public class StringArray implements Aggregate {

    private String values[];

    public StringArray(String[] values) {
        this.values = values;
    }

    @Override
    public Iterator createIterator() {
        return new StringArrayIterator();
    }

    /**
     * 我们在容器中嵌套了迭代器类。这是最好的选择，因为迭代器需要访问容器的内部变量。
     */
    private class StringArrayIterator implements Iterator{
        private int position;

        public boolean hasNext(){
            return (position < values.length);
        }

        public String next(){
            if(this.hasNext()){
                return values[position++];
            }else{
                return null;
            }
        }
    }

    public static void main(String[] args) {
        String arr[] = {"a","b","c","d"};
        StringArray strarr = new StringArray(arr);
        for(Iterator it = strarr.createIterator(); it.hasNext();){
            System.out.println(it.next());
        }
    }


}
