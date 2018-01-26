package ajitkbaral.clotheswear.fregmant;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import ajitkbaral.clotheswear.R;
import ajitkbaral.clotheswear.activity.DetailActivity;

/**
 * Created by bbaral on 1/26/2018.
 */

public class SuggestionFragment extends Fragment implements View.OnClickListener{

    private Button btnBusiness, btnHealth, btnMarriage, btnEducation, btnRelationship;

    public SuggestionFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_suggestion, container, false);
        btnBusiness = (Button) view.findViewById(R.id.btnBusiness);
        btnHealth = (Button) view.findViewById(R.id.btnHealth);
        btnMarriage = (Button) view.findViewById(R.id.btnMarriage);
        btnEducation = (Button) view.findViewById(R.id.btnEducation);
        btnRelationship = (Button) view.findViewById(R.id.btnRelationship);

        btnBusiness.setOnClickListener(this);
        btnHealth.setOnClickListener(this);
        btnMarriage.setOnClickListener(this);
        btnEducation.setOnClickListener(this);
        btnRelationship.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getActivity(), DetailActivity.class);
        Button btn = (Button) v;
        intent.putExtra("title", btn.getText());
        getActivity().startActivity(intent);
    }
}
