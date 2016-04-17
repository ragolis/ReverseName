package com.example.blessed.reversename;

/**
 * Created by Seun Akinsan.
 */
public class DisplayPresenterImpl implements DisplayPresenter{

    private DisplayView displayView;
    private DisplayModelImpl displayModel;

    public DisplayPresenterImpl(DisplayView _displayView)
    {
        this.displayView = _displayView;
        this.displayModel = new DisplayModelImpl();
    }

    @Override
    public void RetrieveName(String Name)
    {
        String _value = displayModel.RetrieveValue(Name);
        displayView.showMessage(_value);
    }

    @Override
    public void onDestroy()
    {
        displayView = null;
    }


}
