package com.redhat.bpms.examples.mortgage;

/**
 * This class was automatically generated by the data modeler tool.
 */
@org.kie.api.definition.type.Label(value = "Mortgage Applicant")
public class Applicant  implements java.io.Serializable {

static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label(value = "Credit Score")
    @org.kie.api.definition.type.Position(value = 3)
    private java.lang.Integer creditScore;

    @org.kie.api.definition.type.Label(value = "Annual Income")
    @org.kie.api.definition.type.Position(value = 2)
    private java.lang.Integer income;

    @org.kie.api.definition.type.Label(value = "Applicant Name")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String name;

    @org.kie.api.definition.type.Label(value = "Social Security Number")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.Integer ssn;

    public Applicant() {
    }

    public Applicant(java.lang.String name, java.lang.Integer ssn, java.lang.Integer income, java.lang.Integer creditScore) {
        this.name = name;
        this.ssn = ssn;
        this.income = income;
        this.creditScore = creditScore;
    }



    public java.lang.Integer getCreditScore() {
        return this.creditScore;
    }

    public void setCreditScore(  java.lang.Integer creditScore ) {
        this.creditScore = creditScore;
    }

    public java.lang.Integer getIncome() {
        return this.income;
    }

    public void setIncome(  java.lang.Integer income ) {
        this.income = income;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setName(  java.lang.String name ) {
        this.name = name;
    }

    public java.lang.Integer getSsn() {
        return this.ssn;
    }

    public void setSsn(  java.lang.Integer ssn ) {
        this.ssn = ssn;
    }

	@Override
	public String toString()
	{
		return "Applicant [creditScore=" + creditScore + ", income=" + income + ", name=" + name + ", ssn=" + ssn + "]";
	}




}
