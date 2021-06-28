package com.sabu.builder;

import javax.print.Doc;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/06/28
 */
public class Doctor {

    private Long id;

    private String name;

    private String mobileNumber;

    private Long regNo;

    private String address;

    private String qualification;

    public Doctor(Long id,
                  String name,
                  String mobileNumber,
                  Long regNo,
                  String address,
                  String qualification) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.regNo = regNo;
        this.address = address;
        this.qualification = qualification;
    }

    public static DoctorBuilder builder() {
        return new DoctorBuilder();
    }

    public static class DoctorBuilder {

        private Long id;

        private String name;

        private String mobileNumber;

        private Long regNo;

        private String address;

        private String qualification;

        public Long getId() {
            return id;
        }

        public DoctorBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public DoctorBuilder name(String name) {
            this.name = name;
            return this;
        }

        public String getMobileNumber() {
            return mobileNumber;
        }

        public DoctorBuilder mobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public Long getRegNo() {
            return regNo;
        }

        public DoctorBuilder regNo(Long regNo) {
            this.regNo = regNo;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public DoctorBuilder address(String address) {
            this.address = address;
            return this;
        }

        public String getQualification() {
            return qualification;
        }

        public DoctorBuilder qualification(String qualification) {
            this.qualification = qualification;
            return this;
        }

        public Doctor build() {
            return new Doctor(id, name, mobileNumber, regNo, address, qualification);
        }
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", regNo=" + regNo +
                ", address='" + address + '\'' +
                ", qualification='" + qualification + '\'' +
                '}';
    }
}
