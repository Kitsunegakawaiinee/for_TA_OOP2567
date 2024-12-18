package Find_length;

import java.lang.Iterable;
import java.util.Iterator;

/**
 * ลิสนี้จะทำการเพิ่มข้อมูลได้โดยการที่เราจะเอาตัวที่เข้ามาใหม่ไปไว้ที่ตัวหน้าสุด
 * <p> และเราจะเข้าถึงตัวต่อไปของได้จาก method get_next() 
 * <p> เข้าถึงสิ่งที่เก็บด้านในมาได้จาก method get_value
 * <p> constains : แต่ละตัวที่เอามาต่อกันต้องมี value เป็นชนิดข้อมูลเดียวกัน (Value have the same type) และ เราไม่ได้ลองรับลิสว่าง
 */
public class Node<Type> implements Iterable<Node<Type>>
    {
        // private :

            //data
            private Type value;
            private Node<Type> next;

            //inner class
            private class Iter implements Iterator<Node<Type>>
            {
                // private:
                    private Node<Type> current;

                    private Node<Type> get_new_list(Node<Type> input)
                    {
                        if(input == null) 
                            return null;
                        
                        if(input.next == null)
                            return input;

                        Node<Type> after_me = get_new_list(input.next);

                        return after_me.add(input.value);
                    }

                // public:
                    public Iter(Node<Type> input)
                    {
                        current = get_new_list(input);
                    }

                    @Override
                    public boolean hasNext() 
                    {
                        return (current != null);
                    }

                    @Override
                    public Node<Type> next() 
                    {
                        Node<Type> for_return = current;
                        current = current.next;
                        return for_return;
                    }
        }

        //public:
            /**
             * Node constructure
             * @param value เป็นค่าที่จะเก็บไว้ใน Node นั้นๆ
             */
            public Node(Type value)
            {
                this.value = value;
            }

            /**
             * เป็นการเพิ่มโหลดเข้าไปในลิส
             * @param value เป็นค่าที่จะเก็บไว้ใน Node ที่จะเพิ่มเข้ามา
             * @return จะส่งโหนดที่เพิ่มไปด้านหน้าของโหลดเก่าออกไป
             */
            public Node<Type> add(Type value)
            {
                Node<Type> temp = new Node<>(value);
                return add(temp);
            }

            /**
             * 
             * @param input เป็นโหลกที่เราจะเอามาไว้ด้านหน้าของโหลดเก่าของเรา
             * @return จะส่งโหนดที่เพิ่มไปด้านหน้าของโหลดเก่าออกไป
             */
            public Node<Type> add(Node<Type> input)
            {
                if(input == null) return this;

                input.next = this;
                return input;
            }   

            //getter
            /**
             * next getter 
             * @return เอาตัวต่อไปของลิสมา
             */
            public Node<Type> get_next()
            {
                return next;
            }

            /**
             * value getter 
             * @return เอาค่าที่ตัวนี้เก็บไว้มา
             */
            public Type get_value()
            {
                return value;
            }

            //overide
            @Override
            public Iterator<Node<Type>> iterator() 
            {
                return new Iter(this);
            }

            public String toString()
            {
                return (value.toString());
            }

            public String string_of_list()
            {
                Character c = 'c';
                return sub_print(!value.getClass().equals(c.getClass()));
            }

            //for print list
            private String sub_print(Boolean not_char)
            {
                StringBuilder sb = new StringBuilder();

                if(not_char) sb.append('[');

                for(Node<Type> i: this)
                {
                    sb.append(i.toString());
                    if(not_char) sb.append(',');
                }

                if(not_char)
                {
                    int last = sb.length()-1;
                    sb.replace(last, last + 1, "");
    
                    sb.append(']');
                }

                return sb.toString();
            }
    }