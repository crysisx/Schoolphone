package com.resource.acitivity;

import java.io.File;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

import com.resource.acitivity.CustomMultipartEntity.ProgressListener;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

public class HttpMultipartPost extends AsyncTask<String, Integer, String> {

	private Context context;
	private String filePath;
	private ProgressDialog pd;
	private long totalSize;

	public HttpMultipartPost(Context context, String filePath) {
		this.context = context;
		this.filePath = filePath;
	}

	@Override
	protected void onPreExecute() {
		pd = new ProgressDialog(context);
		pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
		pd.setMessage("Uploading Picture...");
		pd.setCancelable(false);
		pd.show();
	}

	@Override
	protected String doInBackground(String... params) {
		String serverResponse = null;

		HttpClient httpClient = new DefaultHttpClient();
		HttpContext httpContext = new BasicHttpContext();
		HttpPost httpPost = new HttpPost("上传URL， 如：http://www.xx.com/upload.php");

		try {
			CustomMultipartEntity multipartContent = new CustomMultipartEntity(
					new ProgressListener() {
						@Override
						public void transferred(long num) {
							publishProgress((int) ((num / (float) totalSize) * 100));
						}
					});

			// We use FileBody to transfer an image
			multipartContent.addPart("data", new FileBody(new File(
					filePath)));
			totalSize = multipartContent.getContentLength();

			// Send it
			httpPost.setEntity(multipartContent);
			HttpResponse response = httpClient.execute(httpPost, httpContext);
			serverResponse = EntityUtils.toString(response.getEntity());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return serverResponse;
	}

	@Override
	protected void onProgressUpdate(Integer... progress) {
		pd.setProgress((int) (progress[0]));
	}

	@Override
	protected void onPostExecute(String result) {
		System.out.println("result: " + result);
		pd.dismiss();
	}

	@Override
	protected void onCancelled() {
		System.out.println("cancle");
	}

}
