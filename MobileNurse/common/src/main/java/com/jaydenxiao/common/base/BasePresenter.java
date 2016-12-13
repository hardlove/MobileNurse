package com.jaydenxiao.common.base;

import android.content.Context;

import com.jaydenxiao.common.baserx.RxManager;

/**
 * des:基类presenter
 * Created by xsf
 * on 2016.07.11:55
 */
public abstract class BasePresenter<V extends BaseView, M extends BaseModel> {
    public Context mContext;
    public M mModel;
    public V mView;
    public RxManager mRxManage = new RxManager();

    public BasePresenter(V v, M m){
        mView = v;
        mModel = m;
        this.onStart();
    }

    public void setVM(V v, M m) {
        this.mView = v;
        this.mModel = m;
        this.onStart();
    }

    public void onStart() {
    }


    public void onDestroy() {
        mRxManage.clear();
    }
}
