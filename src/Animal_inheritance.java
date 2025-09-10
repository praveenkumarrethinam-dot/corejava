<<<<<<< HEAD


    class animal{
        String name="";
        int age=0;
        void makesound(){
            System.out.println("make sound");
        }
    }
    class cow extends animal {
        String breed = "";

        void makesound() {
            System.out.println("dog barks");
        }

        void ran() {
            System.out.println("dog ran");
        }
    }
    class goat extends animal{
            String color="";
            void makesound(){
                System.out.println("meow");
            }
            void climb(){
                System.out.println("climb on the tree");
            }
    }

        public class Animal_inheritance {
        public static void main(String[] args) {
        //dog d1=new dog();
        //d1.name="rocky";
        //d1.age=7;
        //d1.breed="lab";
        //d1.makesound();
        //d1.ran();

       // cat c1=new cat();
        //c1.name="cat";
        //c1.age=3;
       // c1.color="black";
        //c1.makesound();
        //c1.climb();
    }
}
=======


    class animal{
        String name="";
        int age=0;
        void makesound(){
            System.out.println("make sound");
        }
    }
    class dog extends animal {
        String breed = "";

        void makesound() {
            System.out.println("dog barks");
        }

        void ran() {
            System.out.println("dog ran");
        }
    }
    class cat extends animal{
            String color="";
            void makesound(){
                System.out.println("meow");
            }
            void climb(){
                System.out.println("climb on the tree");
            }
    }

        public class Animal_inheritance {
        public static void main(String[] args) {
        dog d1=new dog();
        d1.name="rocky";
        d1.age=7;
        d1.breed="lab";
        d1.makesound();
        d1.ran();

        cat c1=new cat();
        c1.name="cat";
        c1.age=3;
        c1.color="black";
        c1.makesound();
        c1.climb();
    }
}
>>>>>>> 53da6943834400b7f24af1c01f3d93479a96dfc0
