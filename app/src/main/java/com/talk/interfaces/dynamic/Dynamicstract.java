package com.talk.interfaces.dynamic;

import com.talk.interfaces.IBasePersenter;
import com.talk.interfaces.IBaseView;
import com.talk.models.bean.dynamic.DynamicSendBean;

public interface Dynamicstract {

    //发布动态数据
    interface View extends IBaseView{
        void sendDynamicReturn(DynamicSendBean dynamicSendBean);
    }

    interface Presenter extends IBasePersenter<View>{
        void sendDynamicData(String txt,String resouces);
    }

}
