package udemyExercies.Person;

    public class Person {
        private String firstName;
        private String lastName;
        private int age;

        public String getFirstName(){ return this.firstName; }

        public String getLastName(){ return this.lastName; }

        public int getAge(){ return this.age; }

        public void setFirstName(String firstName){ this.firstName = firstName; }

        public void setLastName(String lastName){ this.lastName = lastName; }

        public void setAge(int age) {

            if(age < 0 || age > 100)
            {

                this.age = 0;

            } else
                {
                    this.age = age;
                }
        }

        public boolean isTeen() {

            if(this.age > 12 && this.age < 20)
            {

                return true;

            } else
                {
                    return false;
                }
        }

        public String getFullName(){
            String result = "";
            if(firstName.isEmpty() && lastName.isEmpty()){
                result = "";
            }else if(lastName.isEmpty()){
                result = firstName;
            }else if(firstName.isEmpty()){
                result = lastName;
            }else{
                result = firstName + " " + lastName;
            }
            return result;
        }
    }

