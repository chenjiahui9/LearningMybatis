package tk.mybatis.simple.model;

/**
 * @Author: Chenjh
 * @Discription:
 * @Date: Create in 8:30 2018/4/16
 * @Modified By:
 */
public class Country {

    private long id;
    private String countryname;
    private String countrycode;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
}