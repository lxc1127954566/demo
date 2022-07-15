package com.cpy.userdboperation.tool;

/*
*
* 分页工具
*
* */
public class PagerTool {

    private Long totalMeg;
    private Long page;
    private Integer recordSize;
    private Long record;
    private Long totalPage;

    public PagerTool(Long totalMeg, Long page, Integer recordSize){
        this.totalMeg = totalMeg;
        this.page = page;
        this.recordSize = recordSize;
    }

    public Long getTotalPage(){
        if( (this.totalMeg % this.recordSize) == 0 ) {
            this.totalPage = (this.totalMeg / this.recordSize);
        }else {
            this.totalPage = (this.totalMeg / this.recordSize) + 1;
        }
        return this.totalPage;
    }

    public Long getRecord(){
        this.record = (this.page - 1 ) * recordSize;
        return this.record;
    }

/*    public boolean isGetPagerllegal(){
        if(this.page > 0 && this.page <= this.getTotalPage() && this.recordSize >0) {
            return true;
        }
        return false;
    }*/



}
