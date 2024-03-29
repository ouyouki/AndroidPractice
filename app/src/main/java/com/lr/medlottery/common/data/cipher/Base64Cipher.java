package com.lr.medlottery.common.data.cipher;

import com.lr.medlottery.common.assist.Base64;

/**
 * @author MaTianyu
 * @date 14-7-31
 */
public class Base64Cipher extends Cipher {
    private Cipher cipher;

    public Base64Cipher() {
    }

    public Base64Cipher(Cipher cipher) {
        this.cipher = cipher;
    }

    @Override
    public byte[] decrypt(byte[] res) {
        res = Base64.decode(res, Base64.DEFAULT);
        if (cipher != null) {
            res = cipher.decrypt(res);
        }
        return res;
    }

    @Override
    public byte[] encrypt(byte[] res) {
        if (cipher != null) {
            res = cipher.encrypt(res);
        }
        return Base64.encode(res, Base64.DEFAULT);
    }
}
