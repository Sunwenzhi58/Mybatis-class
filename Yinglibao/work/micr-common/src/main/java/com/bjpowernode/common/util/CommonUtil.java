package com.bjpowernode.common.util;

public class CommonUtil {

    //处理pageNo
    public static int defaultPageNo(Integer pageNo){
        int pNo = pageNo;
        if(pageNo == null||pageNo<1){
            pNo=1;
        }
        return pNo;
    }

    //处理pageSize
    public static int defaultPageSize(Integer pageSize){
        int pSize = pageSize;
        if (pageSize==null||pageSize<1){
            pageSize = 1;
        }
        return pageSize;
    }
}
