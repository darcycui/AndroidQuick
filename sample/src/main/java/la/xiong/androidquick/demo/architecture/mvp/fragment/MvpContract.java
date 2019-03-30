package la.xiong.androidquick.demo.architecture.mvp.fragment;

import la.xiong.androidquick.ui.mvp.BaseContract;
import la.xiong.androidquick.ui.mvp.BaseModel;
import la.xiong.androidquick.ui.mvp.BasePresenter;

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public interface MvpContract {
    interface Model extends BaseModel {

    }

    interface View extends BaseContract.BaseView {
        void refreshView(String result);
    }

    abstract class Presenter extends BasePresenter<View> {
        public abstract void initData(String data);
    }
}
