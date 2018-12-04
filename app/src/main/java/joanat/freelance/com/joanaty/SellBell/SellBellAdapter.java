package joanat.freelance.com.joanaty.SellBell;

import android.app.AlertDialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import joanat.freelance.com.joanaty.R;

public class SellBellAdapter extends RecyclerView.Adapter<SellBellAdapter.Vholder> {

    Context context;
    List<ProductInBellSell> agents;

//    View message;
//
//    Button message_send;
//    EditText message_title, message_content;
//    Spinner message_type , message_template;
//    ImageButton close;
//    ArrayList<String> MessageList, indexOfMessageList;

//    LoginDatabae loginDatabae;
//    Cursor cursor;
//    int userid, shopid;

    public SellBellAdapter(Context context, List<ProductInBellSell> agents) {
        this.context = context;
        this.agents = agents;
//        loginDatabae = new LoginDatabae(context);
//        cursor = loginDatabae.ShowData();
    }

    @NonNull
    @Override
    public Vholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_sell_bell, parent, false);
//        while (cursor.moveToNext()) {
//            userid = Integer.parseInt(cursor.getString(2));
//            shopid = Integer.parseInt(cursor.getString(3));
//
//        }
        return new Vholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Vholder holder, final int position) {

        holder.name.setText(agents.get(position).getName()+"");
        holder.barcode.setText(agents.get(position).getBarcode()+"");
        holder.price.setText(agents.get(position).getPrice()+"");
        holder.total.setText(agents.get(position).getTotal() + "");
        holder.discount.setText(agents.get(position).getDiscount() + "");
        holder.amount.setText(agents.get(position).getAmount() + "");
        holder.sell_type.setSelection(agents.get(position).getSell_type()+1);

        holder.barcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agents.add(new ProductInBellSell());
                notifyDataSetChanged();
            }
        });

        holder.sell_type.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        holder.amount.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                return false;
            }
        });

        holder.discount.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                return false;
            }
        });

//        holder.id.setText(agents.get(position).getId());
//        holder.name.setText(agents.get(position).getName());
//        holder.num.setText(agents.get(position).getNum());
//
//        holder.start.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//
//                message = inflater.inflate(R.layout.dialog_message_talabat, null);
//
//                message_type = message.findViewById(R.id.messagetype);
//                message_template = message.findViewById(R.id.message_type);
//                message_title = message.findViewById(R.id.messagetitle);
//                message_content = message.findViewById(R.id.messagecontent);
//                message_send = message.findViewById(R.id.send);
//                close = message.findViewById(R.id.close);
//
//                loadSpinnerTemplate();
//
//                message_type.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//                    @Override
//                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                        if (message_type.getSelectedItem().toString().equals("الكل")) {
//
//                            message_title.setVisibility(View.VISIBLE);
//                            message_content.setVisibility(View.VISIBLE);
//
//                        } else if (message_type.getSelectedItem().toString().equals("رساله نصيه")) {
//
//                            message_title.setVisibility(View.GONE);
//                            message_content.setVisibility(View.VISIBLE);
//                            message_send.setText("إرسال");
////                            if (sdk < Build.VERSION_CODES.JELLY_BEAN) {
////                                message_send.setBackgroundDrawable(ContextCompat.getDrawable(context, R.drawable.button_shape));
////                            } else {
////                                message_send.setBackground(ContextCompat.getDrawable(context, R.drawable.button_shape));
////                            }
//                        } else if (message_type.getSelectedItem().toString().equals("رساله عبر الإيميل")) {
//                            message_title.setVisibility(View.VISIBLE);
//                            message_content.setVisibility(View.VISIBLE);
//                            message_send.setText("إرسال");
////                            if (sdk < Build.VERSION_CODES.JELLY_BEAN) {
////                                message_send.setBackgroundDrawable(ContextCompat.getDrawable(context, R.drawable.button_shape));
////                            } else {
////                                message_send.setBackground(ContextCompat.getDrawable(context, R.drawable.button_shape));
////                            }
//                        }
//                    }
//
//                    @Override
//                    public void onNothingSelected(AdapterView<?> parent) {
//
//                    }
//                });
//
//
//                final AlertDialog.Builder builder = new AlertDialog.Builder(context);
//                builder.setTitle("مراسله")
//                        .setCancelable(false)
//                        .setView(message)
//                        .setNegativeButton("اغلاق", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                // Do Nothing
//                                clearMessageView();
//                                dialog.dismiss();
//                            }
//                        });
//                final AlertDialog dialog2 = builder.create();
//                dialog2.show();
//                dialog2.getWindow().setLayout(1200, 800);
//
//                closeMessage(dialog2);
//                message_send.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        submitMessage(dialog2, message_type.getSelectedItem().toString(), position);
//                    }
//                });
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return agents.size();
    }

    public class Vholder extends RecyclerView.ViewHolder {
        EditText barcode, amount, discount;
        Spinner sell_type;
        TextView name, price, total;

        public Vholder(View itemView) {
            super(itemView);
            barcode = itemView.findViewById(R.id.barcode);
            amount = itemView.findViewById(R.id.amount);
            name = itemView.findViewById(R.id.product_name);
            discount = itemView.findViewById(R.id.discount);
            sell_type = itemView.findViewById(R.id.sell_type);
            price = itemView.findViewById(R.id.price);
            total = itemView.findViewById(R.id.total);
        }
    }

    private void submitMessage(AlertDialog dialog, String s) {
//        clearMessageView();
        if (s.equals("مكالمه تليفونيه")) {

            dialog.dismiss();
        } else if (s.equals("رساله نصيه")) {

            dialog.dismiss();
        } else if (s.equals("رساله عبر الإيميل")) {

            dialog.dismiss();
        }
    }

//    private void closeMessage(final Dialog dialog) {
//        close.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                clearMessageView();
//                dialog.dismiss();
//            }
//        });
//    }
//
//    private void clearMessageView() {
//        if (message != null) {
//            ViewGroup parent = (ViewGroup) message.getParent();
//            if (parent != null) {
//                parent.removeAllViews();
//            }
//        }
//    }
//
//    private void submitMessage(AlertDialog dialog, String c, int s) {
//
//        if (message_type.getSelectedItem().toString().equals("الكل")) {
//
////            Intent intent = new Intent(Intent.ACTION_SEND);
////            intent.setType("message/rfc822");
////            intent.putExtra(Intent.EXTRA_EMAIL, "momen.shahen2020@gmail.com");
////            intent.putExtra(Intent.EXTRA_SUBJECT, message_title.getText().toString());
////            intent.putExtra(Intent.EXTRA_TEXT, message_content.getText().toString());
////            Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + talabats.get(s).getPhone()));
////            intent1.putExtra("sms_body", message_content.getText().toString());
////            try {
////                context.startActivity(Intent.createChooser(intent, "إرسال عبر ..."));
////                context.startActivity(Intent.createChooser(intent1, "إرسال عبر ..."));
////            } catch (android.content.ActivityNotFoundException ex) {
////                Toast.makeText(context, "لا يتواجد اى بريد الكترونى هنا!", Toast.LENGTH_SHORT).show();
////            }
//
//            submitMessage(message_content.getText().toString(),message_title.getText().toString(),message_template.getSelectedItem().toString(),1);
//
//        } else if (message_type.getSelectedItem().toString().equals("رساله نصيه")) {
//
////            Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + talabats.get(s).getPhone()));
////            intent1.putExtra("sms_body", message_content.getText().toString());
////            try {
////                context.startActivity(Intent.createChooser(intent1, "إرسال عبر ..."));
////            } catch (android.content.ActivityNotFoundException ex) {
////                Toast.makeText(context, "لا يتواجد اى بريد الكترونى هنا!", Toast.LENGTH_SHORT).show();
////            }
////
////        } else if (message_type.getSelectedItem().toString().equals("رساله عبر الإيميل")) {
////            Intent intent = new Intent(Intent.ACTION_SEND);
////            intent.setType("message/rfc822");
////            intent.putExtra(Intent.EXTRA_EMAIL, "momen.shahen2020@gmail.com");
////            intent.putExtra(Intent.EXTRA_SUBJECT, message_title.getText().toString());
////            intent.putExtra(Intent.EXTRA_TEXT, message_content.getText().toString());
////            try {
////                context.startActivity(Intent.createChooser(intent, "إرسال عبر ..."));
////            } catch (android.content.ActivityNotFoundException ex) {
////                Toast.makeText(context, "لا يتواجد اى بريد الكترونى هنا!", Toast.LENGTH_SHORT).show();
////            }
//            submitMessage(message_content.getText().toString(),message_title.getText().toString(),message_template.getSelectedItem().toString(),3);
//
//        }else if (message_type.getSelectedItem().toString().equals("رساله عبر الإيميل")){
//            submitMessage(message_content.getText().toString(),message_title.getText().toString(),message_template.getSelectedItem().toString(),2);
//        }
//
//        clearMessageView();
//        dialog.dismiss();
//
//    }
//
//    private void loadSpinnerTemplate() {
//
//        MessageList = new ArrayList<>();
//        indexOfMessageList = new ArrayList<>();
//
//        MessageList.add("--اختر--");
//        indexOfMessageList.add("0");
//        RequestQueue requestQueue = Volley.newRequestQueue(context);
//        StringRequest stringRequest = new StringRequest(Request.Method.POST, "http://www.sellsapi.rivile.com/order/SelectSendsMessages", new Response.Listener<String>() {
//            @Override
//            public void onResponse(String response) {
//                try {
//                    JSONObject jsonObject = new JSONObject(response);
//
//                    JSONArray jsonArray = jsonObject.getJSONArray("SendsMessages");
//                    for (int i = 0; i < jsonArray.length(); i++) {
//                        JSONObject jsonObject1 = jsonArray.getJSONObject(i);
//                        String name = jsonObject1.getString("Name");
//                        String id = jsonObject1.getString("Id");
//                        indexOfMessageList.add(id);
//                        MessageList.add(name);
//
//                    }
//
//                    message_template.setAdapter(new ArrayAdapter<String>(context, android.R.layout.simple_spinner_dropdown_item, MessageList));
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//
//                View layout = inflater.inflate(R.layout.toast_warning,null);
//
//                TextView text = (TextView) layout.findViewById(R.id.txt);
//
//                if (error instanceof ServerError)
//                    text.setText("خطأ فى الاتصال بالخادم");
//                else if (error instanceof TimeoutError)
//                    text.setText("خطأ فى مدة الاتصال");
//                else if (error instanceof NetworkError)
//                    text.setText("شبكه الانترنت ضعيفه حاليا");
//
//                Toast toast = new Toast(context);
//                toast.setGravity(Gravity.BOTTOM, 0, 0);
//                toast.setDuration(Toast.LENGTH_LONG);
//                toast.setView(layout);
//                toast.show();
//            }
//        }){
//            @Override
//            protected Map<String, String> getParams() throws AuthFailureError {
//                HashMap hashMap = new HashMap();
//                hashMap.put("token", "bKPNOJrob8x");
//                return hashMap;
//            }
//        };
//        int socketTimeout = 30000;
//        RetryPolicy policy = new DefaultRetryPolicy(socketTimeout, 2, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
//        stringRequest.setRetryPolicy(policy);
//        requestQueue.add(stringRequest);
//    }
//
//    private void submitMessage(final String Mes, final String sub, final String Res, final int option) {
//
//        final ProgressDialog progressDialog = new ProgressDialog(context);
//        progressDialog.setMessage("انتظر من فضلك ...");
//        progressDialog.setCancelable(false);
//        progressDialog.show();
//        StringRequest stringRequest = new StringRequest(Request.Method.POST, "http://www.sellsapi.rivile.com/Send/Send",
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//
//                        progressDialog.dismiss();
//                        Log.e("Response",response);
//                        if (response.equals("\"Success\"")) {
//
//                            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//
//                            View layout = inflater.inflate(R.layout.toast_info,null);
//
//                            TextView text = (TextView) layout.findViewById(R.id.txt);
//                            text.setText("تمت تنفيذ العملية");
//
//                            Toast toast = new Toast(context);
//                            toast.setGravity(Gravity.BOTTOM, 0, 0);
//                            toast.setDuration(Toast.LENGTH_LONG);
//                            toast.setView(layout);
//                            toast.show();
//
//                        } else {
//
//                            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//
//                            View layout = inflater.inflate(R.layout.toast_error,null);
//
//                            TextView text = (TextView) layout.findViewById(R.id.txt);
//                            text.setText("حدث خطأ اثناء اجراء العمليه");
//
//                            Toast toast = new Toast(context);
//                            toast.setGravity(Gravity.BOTTOM, 0, 0);
//                            toast.setDuration(Toast.LENGTH_LONG);
//                            toast.setView(layout);
//                            toast.show();
//                        }
//
//                    }
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                progressDialog.dismiss();
//
//                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//
//                View layout = inflater.inflate(R.layout.toast_warning,null);
//
//                TextView text = (TextView) layout.findViewById(R.id.txt);
//
//                if (error instanceof ServerError)
//                    text.setText("خطأ فى الاتصال بالخادم");
//                else if (error instanceof TimeoutError)
//                    text.setText("خطأ فى مدة الاتصال");
//                else if (error instanceof NetworkError)
//                    text.setText("شبكه الانترنت ضعيفه حاليا");
//
//                Toast toast = new Toast(context);
//                toast.setGravity(Gravity.BOTTOM, 0, 0);
//                toast.setDuration(Toast.LENGTH_LONG);
//                toast.setView(layout);
//                toast.show();
//            }
//        }) {
//            @Override
//            protected Map<String, String> getParams() {
//                HashMap hashMap = new HashMap();
//                hashMap.put("Mes", Mes);
//                hashMap.put("Res", Res + "");
//                hashMap.put("options", option + "");
//                hashMap.put("Sub", sub + "");
//                hashMap.put("UserId", userid+"");
//                hashMap.put("token", "bKPNOJrob8x");
//                return hashMap;
//            }
//        };
////        Volley.newRequestQueue(context).add(stringRequest);
//        stringRequest.setRetryPolicy(new DefaultRetryPolicy(
//                DefaultRetryPolicy.DEFAULT_TIMEOUT_MS,
//                2,  // maxNumRetries = 2 means no retry
//                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
//        Volley.newRequestQueue(context).add(stringRequest);
//
//    }
}
