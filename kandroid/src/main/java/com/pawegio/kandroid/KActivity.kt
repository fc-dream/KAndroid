package com.pawegio.kandroid

import android.app.Activity
import android.view.View
import android.widget.Toast

/**
 * @author pawegio
 */
suppress("UNCHECKED_CAST")
public fun Activity.find<T : View>(id: Int): T = findViewById(id) as T

suppress("UNCHECKED_CAST")
deprecated("Use Activity.find() instead")
public fun Activity.findView<T : View>(id: Int): T = findViewById(id) as T

public fun Activity.toast(text: CharSequence): Unit = Toast.makeText(this, text, Toast.LENGTH_SHORT).show()

public fun Activity.longToast(text: CharSequence): Unit = Toast.makeText(this, text, Toast.LENGTH_LONG).show()

deprecated("Use Activity.toast() instead")
public fun Activity.shortToast(text: CharSequence): Unit = Toast.makeText(this, text, Toast.LENGTH_SHORT).show()