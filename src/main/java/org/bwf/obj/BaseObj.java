package org.bwf.obj;

public class BaseObj {
    // 当前页码
    protected Integer currentIndex;
    // 每页行数
    protected Integer pageSize;
    // 总记录数
    protected Long recordTotal;
    // 总页数
    protected Integer pageTotal;
    // 排序字段
    protected String orderCol;
    // 倒序还是顺序
    protected String orderDAC;

    public BaseObj () {
        this.currentIndex = 1;
        this.pageSize = 5;
        this.orderDAC = "desc";
    }


    public Integer getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(Integer currentIndex) {
        this.currentIndex = currentIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getRecordTotal() {
        return recordTotal;
    }

    public void setRecordTotal(Long recordTotal) {
        this.recordTotal = recordTotal;
    }

    public Integer getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
    }

    public String getOrderCol() {
        return orderCol;
    }

    public void setOrderCol(String orderCol) {
        this.orderCol = orderCol;
    }

    public String getOrderDAC() {
        return orderDAC;
    }

    public void setOrderDAC(String orderDAC) {
        this.orderDAC = orderDAC;
    }
}
