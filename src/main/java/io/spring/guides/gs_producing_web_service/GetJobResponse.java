//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2014.12.14 时间 11:35:53 PM EST 
//


package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jobID" type="{http://spring.io/guides/gs-producing-web-service}jobID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "jobID"
})
@XmlRootElement(name = "getJobResponse")
public class GetJobResponse {

    @XmlElement(required = true)
    protected JobID jobID;

    /**
     * 获取jobID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JobID }
     *     
     */
    public JobID getJobID() {
        return jobID;
    }

    /**
     * 设置jobID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JobID }
     *     
     */
    public void setJobID(JobID value) {
        this.jobID = value;
    }

}
