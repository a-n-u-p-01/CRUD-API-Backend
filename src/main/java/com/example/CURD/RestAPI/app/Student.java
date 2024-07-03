package com.example.CURD.RestAPI.app;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
public class Student {
        @JsonProperty("rollNo")
        private int rollNo;
        @JsonProperty("name")
        private String name;
        @JsonProperty("age")
        private int age;
        @JsonProperty("className")
        private String className;

        public int getRollNo() {
                return rollNo;
        }

        public void setRollNo(int rollNo) {
                this.rollNo = rollNo;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public String getClassName() {
                return className;
        }

        public void setClassName(String className) {
                this.className = className;
        }
}
