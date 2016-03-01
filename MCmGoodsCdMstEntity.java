/*
 * ファイル名    MCmGoodsCdMstEntity.java
 * 開発システム  次期決済システム本格対応  オンライン
 * 著作権        Copyright(C) 2014 NTT DATA CORPORATION
 * 会社名        NDC
 * 作成日        2014.06.04
 * 作成者        NDC 王陽
 * 履歴情報
 *     2014.06.04   NDC 王陽   初版作成
 */
package jp.cafis.thinclient.common.entity;

import java.io.Serializable;

import jp.cafis.thinclient.framework.base.BaseEntity;

/**
 * 商品コードマスタクラス.<br>
 *
 * @author NDC
 * @version 1.00
 */
public class MCmGoodsCdMstEntity extends BaseEntity implements Serializable {

    /**
     * シリアルバージョンUID.
     */
    private static final long serialVersionUID = -6862827358090413149L;

    /**
     * 商品コード.
     */
    private String goodsCd = null;

    /**
     * 商品名.
     */
    private String goodsName = null;

    /**
     * デフォルトコンストラクタ.
     */
    public MCmGoodsCdMstEntity() {
        super("CREDIT_M_CM_GOODS_CD_MST");
    }

    /**
     * 商品コードの設定.
     *
     * @param goodsCd 商品コード
     */
    public final void setGoodsCd(final String goodsCd) {
        this.goodsCd = goodsCd;
    }

    /**
     * 商品コードの取得.
     *
     * @return 商品コード
     */
    public final String getGoodsCd() {
        return this.goodsCd;
    }

    /**
     * 商品名の設定.
     *
     * @param goodsName 商品名
     */
    public final void setGoodsName(final String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * 商品名の取得.
     *
     * @return 商品名
     */
    public final String getGoodsName() {
        return this.goodsName;
    }

    /**
     * 文字列に変換する処理.<br>
     *
     * @return 文字列
     */
    public final String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append('[');
        builder.append("商品コード=" + getGoodsCd() + ",");
        builder.append("商品名=" + getGoodsName() + ",");
        builder.append("楽観排他キー=" + getOptiExcKey() + ",");
        builder.append("登録ユーザID=" + getRegUsrId() + ",");
        builder.append("登録日時=" + getRegDt() + ",");
        builder.append("更新ユーザID=" + getUpdUsrId() + ",");
        builder.append("更新日時=" + getUpdDt() + ",");
        builder.append("論理削除フラグ=" + getDelFlg());
        builder.append(']');
        return builder.toString();
    }
}
