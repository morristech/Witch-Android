package se.snylt.witchprocessortest;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import se.snylt.witch.viewbinder.TargetViewBinder;
import se.snylt.witch.viewbinder.ViewBinder;

public abstract class TestBase {

    private TargetViewBinder targetViewBinder;

    private Object viewHolder;

    @Before
    public void setup(){
        targetViewBinder = getTargetViewBinder();
        viewHolder = getViewHolder();
    }

    @Test
    public void testSimpleBind(){
        testBind(getTargetViewBinder().getViewBinders(), getViewHolder());
    }

    protected abstract void testBind(List<ViewBinder> binder, Object viewHolder);

    protected abstract Object getViewHolder();

    protected abstract TargetViewBinder getTargetViewBinder();

}