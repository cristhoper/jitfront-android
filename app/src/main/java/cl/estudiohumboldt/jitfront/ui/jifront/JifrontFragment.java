package cl.estudiohumboldt.jitfront.ui.jifront;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cl.estudiohumboldt.jitfront.R;

public class JifrontFragment extends Fragment {

    private JifrontViewModel mViewModel;

    public static JifrontFragment newInstance() {
        return new JifrontFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.jifront_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(JifrontViewModel.class);
        // TODO: Use the ViewModel
    }

}
