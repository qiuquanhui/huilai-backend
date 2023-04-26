package com.quanhui.huilai.once;/**
 * 作者:灰爪哇
 * 时间:2023-04-22
 */

import com.alibaba.excel.EasyExcel;

import java.util.List;

/**
 *
 *
 * @author: shuaihui
 **/
public class ReadDemo {

    public static void main(String[] args) {
        /**
         * 最简单的读
         * <p>
         * 1. 创建excel对应的实体对象
         * <p>
         * 2. 由于默认一行行的读取excel，所以需要创建excel一行一行的回调监听器，
         * <p>
         * 3. 直接读即可
         */
        //simpleRead();
        synchronousRead();
    }
    public static void simpleRead() {

        String fileName ="E:\\code\\plant-project\\huilai-backend\\src\\main\\resources\\testExcel(1).xlsx";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        EasyExcel.read(fileName, TableData.class, new DataListener()).sheet().doRead();
    }


    /**
     * 同步的返回，不推荐使用，如果数据量大会把数据放到内存里面
     */

    public  static  void synchronousRead() {
        String fileName ="E:\\code\\plant-project\\huilai-backend\\src\\main\\resources\\testExcel(1).xlsx";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 同步读取会自动finish
        List<TableData> list = EasyExcel.read(fileName).head(TableData.class).sheet().doReadSync();
        for (TableData data : list) {
            System.out.println(data);
        }
    }
}
