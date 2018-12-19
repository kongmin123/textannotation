package com.annotation.model;

import java.io.Serializable;

public class Content implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content.cid
     *
     * @mbg.generated
     */
    private Integer cid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content.paracontent
     *
     * @mbg.generated
     */
    private String paracontent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content.paraindex
     *
     * @mbg.generated
     */
    private Integer paraindex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content.parastatus
     *
     * @mbg.generated
     */
    private String parastatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content.paracomptime
     *
     * @mbg.generated
     */
    private String paracomptime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content.documentid
     *
     * @mbg.generated
     */
    private Integer documentid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table content
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content.cid
     *
     * @return the value of content.cid
     *
     * @mbg.generated
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content.cid
     *
     * @param cid the value for content.cid
     *
     * @mbg.generated
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content.paracontent
     *
     * @return the value of content.paracontent
     *
     * @mbg.generated
     */
    public String getParacontent() {
        return paracontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content.paracontent
     *
     * @param paracontent the value for content.paracontent
     *
     * @mbg.generated
     */
    public void setParacontent(String paracontent) {
        this.paracontent = paracontent == null ? null : paracontent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content.paraindex
     *
     * @return the value of content.paraindex
     *
     * @mbg.generated
     */
    public Integer getParaindex() {
        return paraindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content.paraindex
     *
     * @param paraindex the value for content.paraindex
     *
     * @mbg.generated
     */
    public void setParaindex(Integer paraindex) {
        this.paraindex = paraindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content.parastatus
     *
     * @return the value of content.parastatus
     *
     * @mbg.generated
     */
    public String getParastatus() {
        return parastatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content.parastatus
     *
     * @param parastatus the value for content.parastatus
     *
     * @mbg.generated
     */
    public void setParastatus(String parastatus) {
        this.parastatus = parastatus == null ? null : parastatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content.paracomptime
     *
     * @return the value of content.paracomptime
     *
     * @mbg.generated
     */
    public String getParacomptime() {
        return paracomptime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content.paracomptime
     *
     * @param paracomptime the value for content.paracomptime
     *
     * @mbg.generated
     */
    public void setParacomptime(String paracomptime) {
        this.paracomptime = paracomptime == null ? null : paracomptime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content.documentid
     *
     * @return the value of content.documentid
     *
     * @mbg.generated
     */
    public Integer getDocumentid() {
        return documentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content.documentid
     *
     * @param documentid the value for content.documentid
     *
     * @mbg.generated
     */
    public void setDocumentid(Integer documentid) {
        this.documentid = documentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cid=").append(cid);
        sb.append(", paracontent=").append(paracontent);
        sb.append(", paraindex=").append(paraindex);
        sb.append(", parastatus=").append(parastatus);
        sb.append(", paracomptime=").append(paracomptime);
        sb.append(", documentid=").append(documentid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}