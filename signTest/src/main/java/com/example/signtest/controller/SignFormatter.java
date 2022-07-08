package com.example.signtest.controller;

import java.util.Base64;

/*************************************************************************
 ******
 * - Copyright (c) 2021 shangzhao.com
 * - File Name: Test
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 *
 * - History:
 * Date        Author          Modification
 * 2021/12/28   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class SignFormatter {

    public final static int IDXR = 3;
    public final static int STD_LEN = 32;

    public static byte[] std2ph(byte[] data) {
        int deltar = 0, deltas = 0;

        int rlen = data[IDXR];
        if (rlen < STD_LEN) {
            deltar += STD_LEN - rlen;
        }
        int slen = data[IDXR + 2 + rlen];
        if (slen < STD_LEN) {
            deltas += STD_LEN - slen;
        }
        if (0 == deltar && 0 == deltas) {
            return data;
        }
        byte[] buf = new byte[data.length + deltar + deltas];
        int i = 0, j = 0;
        buf[j++] = data[i++];
        buf[j++] = (byte) (data[i++] + deltar + deltas);
        buf[j++] = data[i++];
        if (0 == deltas) {
            buf[j++] = (byte) (data[i++] + deltar);
            System.arraycopy(data, i, buf, j + deltar, rlen + 2 + slen);
        } else if (0 == deltar) {
            buf[j++] = data[i++];
            System.arraycopy(data, i, buf, j, rlen);
            j += rlen;
            i = j;
            buf[j++] = data[i++];
            buf[j++] = (byte) (data[i++] + deltas);
            System.arraycopy(data, i, buf, j + deltas, slen);
        } else {
            buf[j++] = (byte) (data[i++] + deltar);
            System.arraycopy(data, i, buf, j + deltar, rlen);
            j += rlen + deltar;
            i += rlen;
            buf[j++] = data[i++];
            buf[j++] = (byte) (data[i++] + deltas);
            System.arraycopy(data, i, buf, j + deltas, slen);

        }
        return buf;
    }
}
