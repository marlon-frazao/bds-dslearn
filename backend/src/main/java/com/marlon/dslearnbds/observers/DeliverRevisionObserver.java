package com.marlon.dslearnbds.observers;

import com.marlon.dslearnbds.entities.Deliver;

public interface DeliverRevisionObserver {

	void onSaveRevision(Deliver deliver);
}
